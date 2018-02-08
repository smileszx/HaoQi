package com.haoqi.vs.util;

import com.google.zxing.LuminanceSource;

/**
 * 用于二维码的解析，Google提供
 * @author zhengxiao.su
 * @date 2018-02-08 16:00:00
 */
public final class BufferedImageLuminanceSource extends LuminanceSource{

	protected BufferedImageLuminanceSource(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] getMatrix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getRow(int arg0, byte[] arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
