package org.saaras;

public class Driver extends Video{

    public int calculateSpeed(){
        return -1;
    }

    public static void main(String[] args) {

//        Video video = new Video();
//        video.createdBy = "Piyush";

        Driver driver = new Driver();
        driver.duration = 10;
        driver.createdBy = "Piyush";


    }
}