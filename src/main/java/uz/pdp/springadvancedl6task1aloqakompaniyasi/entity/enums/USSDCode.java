package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums;

public enum USSDCode {
    CHECK_TRAFFIC(100),
    CHANGE_TRAFFIC(200);

    private int trafficCode;

    USSDCode(int trafficCode) {
        this.trafficCode = trafficCode;
    }
}
