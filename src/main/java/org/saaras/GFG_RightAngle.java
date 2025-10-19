package org.saaras;

public class GFG_RightAngle {
    private int size;

    public GFG_RightAngle(int size){
        this.size=size;
    }
    public int printResult(){
        //System.out.println("\n");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(j==0) {
                    System.out.print("\n *");
                }
                else if(i==j){
                    System.out.print("*");
                }else{
                    if(i==size-1 && j < size-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
        }

        return 1;
    }
}
