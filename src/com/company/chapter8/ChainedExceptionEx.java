package com.company.chapter8;

public class ChainedExceptionEx {
    public static void main(String[] args){
        try{
            install();
        } catch (InstallException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    static void install() throws InstallException{
        try{
            startInstall();
            copyFiles();
        } catch (SpaceException se){
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException{
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()){
            //throw new MemoryException("메모리가 부족합니다. ");
            //이렇게 적으면 memoryException을 따로 throw로 적지 않아도 된다. 즉, 이게 unchecked exception
            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }
    static void copyFiles(){};
    static void deleteTempFiles(){};
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
}
class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}