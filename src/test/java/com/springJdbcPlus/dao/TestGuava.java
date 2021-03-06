package com.springJdbcPlus.dao;

import com.google.common.base.CaseFormat;
import core.utils.NameHandler;

/**
 * @Auther: geguofeng
 * @Date: 2018/12/12
 * @Description:
 */
public class TestGuava {

    public static void main(String[] args) {

        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));//testData
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));//testData
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));//TestData

        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "testdata"));//testdata
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TestData"));//test_data
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "testData"));//test-data

        System.out.println(NameHandler.toLowerCamel("idCard"));
        System.out.println(NameHandler.toLowerUnderscore("id_card"));

    }
}
