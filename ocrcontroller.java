package com.example.ocr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@SpringBootApplication
@Controller
public class ocr1 
{
	public static File convert(MultipartFile file) throws IOException
	{	
		File convFile = new File(file.getOriginalFilename());
		convFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}
	@Autowired
	@RequestMapping(value="/")
	public static String FileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Model model) throws IOException, TesseractException
	{	
		byte[] bytes = file.getBytes();
	    Path path = Paths.get("D:\\MyWorkspace" + file.getOriginalFilename());
	    Files.write(path, bytes);
	    File convFile = convert(file);
	    Tesseract tesseract = new Tesseract();
	    tesseract.setDatapath("D:\\MyWorkspace\\tessdata");
	    String text = tesseract.doOCR(convFile);
	    redirectAttributes.addFlashAttribute("file", file);
	    redirectAttributes.addFlashAttribute("text", text);  
		return "ocr.html";

	}  
}
