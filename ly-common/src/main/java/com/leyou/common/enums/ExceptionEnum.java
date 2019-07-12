package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(404, "价格不能为空！"),
    NAME_CANNOT_BE_NULL(404, "姓名不能为空！"),
    CATEGORY_NOT_FOUND(404, "商品分类没查到"),
    BRAND_NOT_FOUND(404, "品牌不存在"),
    BRAND_SAVE_ERROR(500, "保存品牌失败"),
    CATEGORY_BRAND_SAVE_ERROR(500,"新增品牌分类失败"),
    UPLOAD_FILE_ERROR(500,"文件上传失败"),
    INVALID_FILE_TYPE(500,"无效的文件类型");
    private int code;
    private String msg;
}
