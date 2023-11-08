package com.chinalife.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 农险财政厅中间表
 */
@Data
@Entity
@Table(name = "PTM_AGRI_INFO")
public class PtmAgriInfoEO{

    private String id;

//    @Column(name = "ERRORMESSAGE")
    private String errorMessage;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId(Object id) {
        if (id != null) {
            this.id = (String) id;
        } else {
            this.id = null;
        }
    }

    /**
     * actualid
     */
//    @Column(name = "ACTUALID")
    private Long actualId;
    /**
     * 业务号
     */
//    @Column(name = "BUSINESSNO")
    private String businessNo;
    /**
     * 投保单号
     */
//    @Column(name = "PROPOSALNO")
    private String proposalNo;
//    /**
//     * 保单号
//     */
//    private String policyNo;
//    /**
//     * 批改单号
//     */
//    private String endorseNo;
//    /**
//     * 业务类型
//     */
//    private String businessType;
//    /**
//     * 报送状态
//     */
//    private String sendStatus;
//    /**
//     * 插入时间
//     */
//    private Date insertTime;
//    /**
//     * 报送时间
//     */
//    private Date sendTime;
//    /**
//     * 更新时间
//     */
//    private Date updateTime;
//    /**
//     * 报送次数
//     */
//    private Integer sendTimes;
//    /**
//     * 操作人员
//     */
//    private String operator;
//
//    /**
//     * 产品编码
//     */
//    private String productCode;
//    /**
//     * 产品名称
//     */
//    private String productName;
//    /**
//     * 出单机构编码
//     */
//    private String makeCom;
//    /**
//     * 出单机构名称
//     */
//    private String makeComName;
//
//    /**
//     * 险类代码
//     */
//    private String classCode;
//
//    /**
//     * 批单申请号
//     */
//    private String endorseRequestNo;
//    /**
//     * 保单确认码
//     **/
//    private String informNumber;
//    /**
//     * 批次号
//     */
//    private String batchNo;
//    /**
//     * 旧批次号
//     */
//    private String oldBatchNo;
//    /**
//     * 请求类型
//     */
//    private String requestType;
//    /**
//     * 请求名称
//     */
//    private String requestName;
//    /**
//     * 电子保、批单下载地址
//     */
//    private String downloadAddress;
//    /**
//     * 电子保单下载状态
//     */
//    private String downloadPdfStatus;
//    /**
//     * 保、批单分户清单是否上传成功
//     */
//    private String uploadFileStatus;
//    /**
//     * 保、批单分户清单以文件形式上传时平台是否解析成功
//     */
//    private String uploadFileSuccessStatus;
//    /**
//     * 公示编码
//     */
//    private String publicityNumber;
//    /**
//     * 投保验证码
//     */
//    private String insureValidateDto;
//    /**
//     * 条款已阅标志
//     */
//    private String readClauseFlag;
//
//    /**
//     * 单证确认码
//     */
//    private String policyAffirmNo;
//
//    /**
//     * 平台标识，财政厅、电子化、全国农险平台、中农再等
//     */
//    private String platformCode;

//    public String getEndorseRequestNo() {
//        return endorseRequestNo;
//    }
//
//    public void setEndorseRequestNo(String endorseRequestNo) {
//        this.endorseRequestNo = endorseRequestNo;
//    }
//
//    public String getInformNumber() {
//        return informNumber;
//    }
//
//    public void setInformNumber(String informNumber) {
//        this.informNumber = informNumber;
//    }
//
//    public String getBatchNo() {
//        return batchNo;
//    }
//
//    public void setBatchNo(String batchNo) {
//        this.batchNo = batchNo;
//    }
//
//    public String getOldBatchNo() {
//        return oldBatchNo;
//    }
//
//    public void setOldBatchNo(String oldBatchNo) {
//        this.oldBatchNo = oldBatchNo;
//    }
//
//    public String getRequestType() {
//        return requestType;
//    }
//
//    public void setRequestType(String requestType) {
//        this.requestType = requestType;
//    }
//
//    public String getRequestName() {
//        return requestName;
//    }
//
//    public void setRequestName(String requestName) {
//        this.requestName = requestName;
//    }
//
//    public String getDownloadAddress() {
//        return downloadAddress;
//    }
//
//    public void setDownloadAddress(String downloadAddress) {
//        this.downloadAddress = downloadAddress;
//    }
//
//    public String getDownloadPdfStatus() {
//        return downloadPdfStatus;
//    }
//
//    public void setDownloadPdfStatus(String downloadPdfStatus) {
//        this.downloadPdfStatus = downloadPdfStatus;
//    }
//
//    public String getUploadFileStatus() {
//        return uploadFileStatus;
//    }
//
//    public void setUploadFileStatus(String uploadFileStatus) {
//        this.uploadFileStatus = uploadFileStatus;
//    }
//
//    public String getUploadFileSuccessStatus() {
//        return uploadFileSuccessStatus;
//    }
//
//    public void setUploadFileSuccessStatus(String uploadFileSuccessStatus) {
//        this.uploadFileSuccessStatus = uploadFileSuccessStatus;
//    }
//
//    public String getPublicityNumber() {
//        return publicityNumber;
//    }
//
//    public void setPublicityNumber(String publicityNumber) {
//        this.publicityNumber = publicityNumber;
//    }
//
//    public String getInsureValidateDto() {
//        return insureValidateDto;
//    }
//
//    public void setInsureValidateDto(String insureValidateDto) {
//        this.insureValidateDto = insureValidateDto;
//    }
//
//    public String getReadClauseFlag() {
//        return readClauseFlag;
//    }
//
//    public void setReadClauseFlag(String readClauseFlag) {
//        this.readClauseFlag = readClauseFlag;
//    }
//
//    public String getPolicyAffirmNo() {
//        return policyAffirmNo;
//    }
//
//    public void setPolicyAffirmNo(String policyAffirmNo) {
//        this.policyAffirmNo = policyAffirmNo;
//    }
//
//    public String getPlatformCode() {
//        return platformCode;
//    }
//
//    public void setPlatformCode(String platformCode) {
//        this.platformCode = platformCode;
//    }
//
//    public String getClassCode() {
//        return classCode;
//    }
//
//    public void setClassCode(String classCode) {
//        this.classCode = classCode;
//    }
//
//    public String getProductCode() {
//        return productCode;
//    }
//
//    public void setProductCode(String productCode) {
//        this.productCode = productCode;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getMakeCom() {
//        return makeCom;
//    }
//
//    public void setMakeCom(String makeCom) {
//        this.makeCom = makeCom;
//    }
//
//    public String getMakeComName() {
//        return makeComName;
//    }
//
//    public void setMakeComName(String makeComName) {
//        this.makeComName = makeComName;
//    }
//
//    public Long getActualId() {
//        return actualId;
//    }
//
//    public void setActualId(Long actualId) {
//        this.actualId = actualId;
//    }
//
//    public String getBusinessNo() {
//        return businessNo;
//    }
//
//    public void setBusinessNo(String businessNo) {
//        this.businessNo = businessNo;
//    }
//
//    public String getProposalNo() {
//        return proposalNo;
//    }
//
//    public void setProposalNo(String proposalNo) {
//        this.proposalNo = proposalNo;
//    }
//
//    public String getPolicyNo() {
//        return policyNo;
//    }
//
//    public void setPolicyNo(String policyNo) {
//        this.policyNo = policyNo;
//    }
//
//    public String getEndorseNo() {
//        return endorseNo;
//    }
//
//    public void setEndorseNo(String endorseNo) {
//        this.endorseNo = endorseNo;
//    }
//
//    public String getBusinessType() {
//        return businessType;
//    }
//
//    public void setBusinessType(String businessType) {
//        this.businessType = businessType;
//    }
//
//    public String getSendStatus() {
//        return sendStatus;
//    }
//
//    public void setSendStatus(String sendStatus) {
//        this.sendStatus = sendStatus;
//    }
//
//    public Date getInsertTime() {
//        return insertTime;
//    }
//
//    public void setInsertTime(Date insertTime) {
//        this.insertTime = insertTime;
//    }
//
//    public Date getSendTime() {
//        return sendTime;
//    }
//
//    public void setSendTime(Date sendTime) {
//        this.sendTime = sendTime;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public Integer getSendTimes() {
//        return sendTimes;
//    }
//
//    public void setSendTimes(Integer sendTimes) {
//        this.sendTimes = sendTimes;
//    }
//
//    public String getOperator() {
//        return operator;
//    }
//
//    public void setOperator(String operator) {
//        this.operator = operator;
//    }
//
//    public String getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public String getErrorMessage() {
//        return errorMessage;
//    }
//
//    public void setErrorMessage(String errorMessage) {
//        this.errorMessage = errorMessage;
//    }

//    /**
//     * 错误代码
//     */
//    private String errorCode;
//    /**
//     * 错误代码
//     */
//    private String errorMessage;
//
//    /**
//     * 省份编码
//     */
//    private String provinceCode;
//
//    /**
//     * 平台险种代码
//     */
//    private String ptRiskCode;
//
//    /**
//     * 平台险种名称
//     */
//    private String ptRiskName;
//
//    public String getProvinceCode() {
//        return provinceCode;
//    }
//
//    public void setProvinceCode(String provinceCode) {
//        this.provinceCode = provinceCode;
//    }
//
//    public String getPtRiskCode() {
//        return ptRiskCode;
//    }
//
//    public void setPtRiskCode(String ptRiskCode) {
//        this.ptRiskCode = ptRiskCode;
//    }
//
//    public String getPtRiskName() {
//        return ptRiskName;
//    }
//
//    public void setPtRiskName(String ptRiskName) {
//        this.ptRiskName = ptRiskName;
//    }
}
