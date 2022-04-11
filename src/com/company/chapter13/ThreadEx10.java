package com.company.chapter13;

public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); //이 부분이 없다면 절대 종료되지 않으며, 반드시 start()를 호출하기 전에 위치해야 한다.
        t.start();

        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.println(i);

            if(i == 5)
                autoSave = true;
        }
        System.out.println("프로그램을 종료합니다.");

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) { }

            if(autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave(){
        System.out.println("작업파일이 자동저장 되었습니다.");
    }
}
