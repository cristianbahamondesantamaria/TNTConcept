package com.autentia.tnt.businessobject;

import com.autentia.tnt.dao.ITransferObject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TaxFreeReason implements Serializable, ITransferObject {

    private Integer id;
    private String code;
    private String reason;

    private Integer ownerId;
    private Integer departmentId;
    private Date insertDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public Integer getOwnerId() {
        return ownerId;
    }

    @Override
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public Integer getDepartmentId() {
        return departmentId;
    }

    @Override
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public Date getInsertDate() {
        return insertDate;
    }

    @Override
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public List<Integer> getOwnersId() {
        return null;
    }
}
