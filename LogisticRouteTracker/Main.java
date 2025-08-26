abstract class checkPoint{
    int checkpointId;
    String locationName;
    int distanceFromLast; 
    int expectedDuration; 
    int actualDuration;

    checkPoint(int checkPoint, String locationNamem, int distanceFromLast, int expectedDuration, int actualDuration){
        this.checkPoint = checkPoint;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
    }
    

    boolean isCritical();
    int getType();
    double calculatePenalty(); 
    boolean isDelayed()
    double calculatePenalty()
    

}
class RouteLinkedList<T extends checkPoint>{

}
class Main{
    public static void main(String args[]){

    }
}