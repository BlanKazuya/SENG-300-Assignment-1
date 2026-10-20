package gocycle;

public class Rider {
    private String id;
    private String membership;
    private String paymentInfo;

    public Rider(String id, String membership, String paymentInfo){
        this.id=id;
        this.membership=membership;
        this.paymentInfo=paymentInfo;
    }
}
