package io.nutz.nutzsite.module.sys.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import io.nutz.nutzsite.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 区域表 sys_area
 *
 * @author haiming
 * @date 2019-04-11
 */
@Table("sys_area")
public class Area extends Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @Name
    @Column("id")
    @Comment
    @ColDefine(type = ColType.VARCHAR, width = 64)
//    @Prev(els = {@EL("uuid()")})
    private String id;

    /**
     * 父节点
     */
    @Column("parent_id")
    @Comment("父节点 ")
    private String parentId;
    /**
     * 祖节点
     */
    @Column("ancestors")
    @Comment("祖节点 ")
    private String ancestors;
    /**
     * 城市编码
     */
    @Column("citycode")
    @Comment("城市编码 ")
    private String citycode;
    /**
     * 区域编码
     */
    @Column("adcode")
    @Comment("区域编码 ")
    private String adcode;
    /**
     * 行政区名称
     */
    @Column("name")
    @Comment("行政区名称 ")
    private String name;
    /**
     * 行政区划级别
     */
    @Column("level")
    @Comment("行政区划级别 ")
    private String level;
    /**
     * 创建者
     */
    @Column("create_by")
    @Comment("创建者 ")
    private String createBy;
    /**
     * 创建时间
     */
    @Column("create_time")
    @Comment("创建时间 ")
    private Date createTime;
    /**
     * 更新者
     */
    @Column("update_by")
    @Comment("更新者 ")
    private String updateBy;
    /**
     * 更新时间
     */
    @Column("update_time")
    @Comment("更新时间 ")
    private Date updateTime;

    private String parentName;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("parentId", getParentId())
                .append("ancestors", getAncestors())
                .append("citycode", getCitycode())
                .append("adcode", getAdcode())
                .append("name", getName())
                .append("level", getLevel())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
