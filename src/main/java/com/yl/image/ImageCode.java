package com.yl.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class ImageCode extends VerificationCode{
	 
    private BufferedImage image;
 
    public ImageCode(BufferedImage image, String code, int expireTime) {
        super(code, expireTime);
        this.image = image;
    }
 
    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
        super(code, expireTime);
        this.image = image;
    }
 
    public BufferedImage getImage() {
        return image;
    }
 
    public void setImage(BufferedImage image) {
        this.image = image;
    }
}

