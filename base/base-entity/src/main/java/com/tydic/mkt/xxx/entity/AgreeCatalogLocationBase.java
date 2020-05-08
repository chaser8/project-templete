package com.tydic.mkt.xxx.entity;

import com.tydic.dev1.common.base.entity.EntityBase;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import com.tydic.dev1.common.base.validation.ValidGoup;

/**
 * <p>
 * 记录协议目录中有哪些协议模板
 * </p>
 *
 * @author yzb
 * @since 2019-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("agree_catalog_location")
@ApiModel(value="AgreeCatalogLocation", description="记录协议目录中有哪些协议模板")
public class AgreeCatalogLocationBase extends EntityBase<AgreeCatalogLocationBase> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录位置标识")
    @Range(groups = {ValidGoup.Add.class,ValidGoup.Update.class,ValidGoup.Page.class})
    @TableId(value = "CATALOG_LOC_ID", type = IdType.AUTO)
    private Long catalogLocId;

    @ApiModelProperty(value = "记录协议模板标识")
    @Range(groups = {ValidGoup.Add.class,ValidGoup.Update.class,ValidGoup.Page.class})
    @TableField("AGREEMENT_TMP_ID")
    private Long agreementTmpId;

    @ApiModelProperty(value = "记录目录节点标识")
    @Range(groups = {ValidGoup.Add.class,ValidGoup.Update.class,ValidGoup.Page.class})
    @TableField("CATALOG_ITEM_ID")
    private Long catalogItemId;


    @Override
    protected Serializable pkVal() {
        return this.catalogLocId;
    }

}
