package com.Practice.QR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class QRCodeController {
	
	private static final String QR_Path = "./src/main/resources/QRCode.png";

	@RequestMapping("/QR/{codeText}/{width}/{height}")
	@ResponseBody
  public void download(@PathVariable("codeText") String codeText,@PathVariable("width") Integer width,@PathVariable("height") Integer height)
			    throws Exception {
			        QRCodeGenerator.generateQRCodeImage(codeText, width, height, QR_Path);
			    }
}
