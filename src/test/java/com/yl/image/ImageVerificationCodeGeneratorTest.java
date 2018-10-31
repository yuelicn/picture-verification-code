package com.yl.image;

import org.junit.Test;

public class ImageVerificationCodeGeneratorTest {

	@Test
	public void testGenerator() {
		ImageVerificationCodeGenerator image = new ImageVerificationCodeGenerator();
		ImageCode generator = image.generator();
		String code = generator.getCode();
		//BufferedImage image2 = generator.getImage();
		System.out.println("code = " + code);

	}

}
