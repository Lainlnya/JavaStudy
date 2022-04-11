package com.company.chapter13;

public class ThreadEx9 {
    public static void main(String args[]) throws Exception {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
        //threadGroup을 지정하지 않으면 자동으로 main그룹 안으로 들어간다.
        grp1.setMaxPriority(3);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
        };
        new Thread(grp1, r, "th1").start();
        new Thread(subGrp1, r, "th2").start();
        new Thread(grp2, r, "th3").start();

        System.out.println(
                ">>List of ThreadGroup : " + main.getName()
                + ", Active ThreadGroup: " + main.activeGroupCount()
                + ", Active Thread: " + main.activeCount());

        main.list();
    }
}
