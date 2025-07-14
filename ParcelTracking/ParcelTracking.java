// ParcelTracker – Delivery Chain Management (Singly Linked List)
// Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit → Delivered.
// Each stage is a node 
// Requirements:
// ● Forward tracking through stages.
// ● Add custom intermediate checkpoints.
// ● Handle lost/missing parcels (null pointers).


public class ParcelTracking{
    static class ParcelNode {
        String stage;
        ParcelNode next;

        ParcelNode(String stage) {
            this.stage = stage;
            this.next = null;
        }
    }
    private ParcelNode head;
    public void addStage(String stage) {
        ParcelNode newNode = new ParcelNode(stage);
        if (head == null) {
            head = newNode;
        } else {
            ParcelNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printStages() {
        ParcelNode current = head;
        while (current != null) {
            System.out.print(current.stage + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void addCheckpoint(String stage) {
        ParcelNode newNode = new ParcelNode(stage);
        if (head == null) {
            head = newNode;
        } else {
            ParcelNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void handleMissingParcel() {
        if (head == null) {
            System.out.println("No parcels to track.");
            return;
        }
        ParcelNode current = head;
        while (current != null) {
            if (current.stage == null) {
                System.out.println("Parcel is missing at this stage.");
                return;
            }
            current = current.next;
        }
        System.out.println("All parcels are accounted for.");
    }
    public void removeStage(String stage) {
        if (head == null) return;
        if (head.stage.equals(stage)) {
            head = head.next;
            return;
        }
        ParcelNode current = head;
        while (current.next != null && !current.next.stage.equals(stage)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public static void main(String[] args) {
        ParcelTracking tracking = new ParcelTracking();
        tracking.addStage("Packed");
        tracking.addStage("Shipped");
        tracking.addStage("In Transit");
        tracking.addStage("Delivered");

        System.out.println("Parcel Tracking Stages:");
        tracking.printStages();

        tracking.addCheckpoint("Custom Checkpoint 1");
        System.out.println("After adding a custom checkpoint:");
        tracking.printStages();

        tracking.handleMissingParcel();

        tracking.removeStage("In Transit");
        System.out.println("After removing 'In Transit' stage:");
        tracking.printStages();
    }
}