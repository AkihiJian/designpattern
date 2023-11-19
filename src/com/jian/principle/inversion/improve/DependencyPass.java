package com.jian.principle.inversion.improve;

public class DependencyPass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

        //
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
        //
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

    }

}

//方式1 通过接口传递实现依赖
// interface IOpenAndClose {
// public void open(ITV tv);
// }
//
 interface ITV { //ITV
 public void play();
 }
//
 class ChangHong implements ITV {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("长虹电视机，打开");
	}
//
// }

// class OpenAndClose implements IOpenAndClose{
// public void open(ITV tv){
// tv.play();
// }
// }

// 方式2: 通过构造器
interface IOpenAndClose {
    public void open();
}

interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}}


// 方式3 , setter
//interface IOpenAndClose {
//	public void open();
//
//	public void setTv(ITV tv);
//}
//
//interface ITV {
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//
//	public void setTv(ITV tv) {
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}
//
//class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("长虹电视机，打开");
//	}
//
//}