package exception.basic.unchecked;

import exception.basic.checked.MyCheckedException;

//UnChecked 예외는 예외를 잡거나 던지지 않아도 된다.(잡지 않으면 자동으로 밖으로 던진다.)
public class Service {
    Client client = new Client();

    //필요한 경우 예외를 잡아서 처리
    public void callCatch(){

        try{
            client.call();
        }catch (MyUnCheckedException e){
            //예외처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상로직");
    }

    //예외를 잡지 않아도 자연스럽게 상위로 넘어감(throws 생략 가능)
    public void catchThrow()  {
        client.call();
    }
}
