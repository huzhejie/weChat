package Models;

/**
 * Created by huzhejie on 2016/7/19.
 */
public class UserInfo {
    private String userId="";
    private String nickName="";
    private String signature="";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
