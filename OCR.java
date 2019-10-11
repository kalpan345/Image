package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
@Service
public class OCR {
    public static File convert(MultipartFile file) throws IOException
    {	
	        File convFile = new File(file.getOriginalFilename());
	        convFile.createNewFile();
		    FileOutputStream fos = new FileOutputStream(convFile);
		    fos.write(file.getBytes());
		    fos.close();
	        return convFile;
    }
    
    
	public static void FileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Model model) throws IOException, TesseractException
	{

    	byte[] bytes = file.getBytes();
    	Path path = Paths.get("D:\\MyWorkspace" + file.getOriginalFilename());
    	Files.write(path, bytes);
    	File convFile = OCR.convert(file);
    	Tesseract tesseract = new Tesseract();
    	tesseract.setDatapath("D:\\MyWorkspace\\tessdata");
    	String text = tesseract.doOCR(convFile);
    	redirectAttributes.addFlashAttribute("file", file);
    	redirectAttributes.addFlashAttribute("text", text);
    	
    }
}
