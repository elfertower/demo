package entity;

import java.io.Serializable;
import java.util.Date;

public class ConnInfo implements Serializable {
    private String id;

    private Date connectLasttime;

    private String connectLastip;

    private String loginExt;

    private String loginAgent;

    private String loginPassword;

    private String channelId;

    private Date recordTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getConnectLasttime() {
        return connectLasttime;
    }

    public void setConnectLasttime(Date connectLasttime) {
        this.connectLasttime = connectLasttime;
    }

    public String getConnectLastip() {
        return connectLastip;
    }

    public void setConnectLastip(String connectLastip) {
        this.connectLastip = connectLastip == null ? null : connectLastip.trim();
    }

    public String getLoginExt() {
        return loginExt;
    }

    public void setLoginExt(String loginExt) {
        this.loginExt = loginExt == null ? null : loginExt.trim();
    }

    public String getLoginAgent() {
        return loginAgent;
    }

    public void setLoginAgent(String loginAgent) {
        this.loginAgent = loginAgent == null ? null : loginAgent.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConnInfo other = (ConnInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConnectLasttime() == null ? other.getConnectLasttime() == null : this.getConnectLasttime().equals(other.getConnectLasttime()))
            && (this.getConnectLastip() == null ? other.getConnectLastip() == null : this.getConnectLastip().equals(other.getConnectLastip()))
            && (this.getLoginExt() == null ? other.getLoginExt() == null : this.getLoginExt().equals(other.getLoginExt()))
            && (this.getLoginAgent() == null ? other.getLoginAgent() == null : this.getLoginAgent().equals(other.getLoginAgent()))
            && (this.getLoginPassword() == null ? other.getLoginPassword() == null : this.getLoginPassword().equals(other.getLoginPassword()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConnectLasttime() == null) ? 0 : getConnectLasttime().hashCode());
        result = prime * result + ((getConnectLastip() == null) ? 0 : getConnectLastip().hashCode());
        result = prime * result + ((getLoginExt() == null) ? 0 : getLoginExt().hashCode());
        result = prime * result + ((getLoginAgent() == null) ? 0 : getLoginAgent().hashCode());
        result = prime * result + ((getLoginPassword() == null) ? 0 : getLoginPassword().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", connectLasttime=").append(connectLasttime);
        sb.append(", connectLastip=").append(connectLastip);
        sb.append(", loginExt=").append(loginExt);
        sb.append(", loginAgent=").append(loginAgent);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", channelId=").append(channelId);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}