package com.hansintelligent.rrrmvpframework.utils;

import android.content.Context;
import android.text.TextUtils;

import com.hansintelligent.rrrmvpframework.widget.CustomToast;

/**
 * 输入校验
 * Created by brin on 2018/7/3.
 */

public class ValidationUtil {

    private final static int PHONE_LENGTH = 11;//手机号长度
    private final static int SMS_CODE_LENGTH = 6;//短信验证码长度
    private final static int PASSWORD_MIN_LENGTH = 6;//密码最小长度
    private final static int PASSWORD_MAX_LENGTH = 15;//密码最大长度


    /**
     * 校验手机号
     *
     * @param context
     * @param phoneNumber
     */
    public static boolean checkPhoneNumber(Context context, String phoneNumber) {
        if (TextUtils.isEmpty(phoneNumber)) {
            CustomToast.INSTANCE.showToast(context, "手机号不能为空");
            return false;
        }
        if (phoneNumber.length() < PHONE_LENGTH) {
            CustomToast.INSTANCE.showToast(context, "请输入11位手机号");
            return false;
        }
        return true;
    }

    /**
     * 校验验证码
     *
     * @param context
     * @param smsCode
     */
    public static boolean checkSmsCode(Context context, String smsCode) {
        if (TextUtils.isEmpty(smsCode)) {
            CustomToast.INSTANCE.showToast(context, "验证码不能为空");
            return false;
        }
        if (smsCode.length() < SMS_CODE_LENGTH) {
            CustomToast.INSTANCE.showToast(context, "请输入6位验证码");
            return false;
        }
        return true;
    }

    /**
     * 校验密码
     *
     * @param context
     * @param password
     * @return
     */
    public static boolean checkPassword(Context context, String password) {
        if (TextUtils.isEmpty(password)) {
            CustomToast.INSTANCE.showToast(context, "密码不能为空");
            return false;
        }
        if (password.length() < PASSWORD_MIN_LENGTH || password.length() > PASSWORD_MAX_LENGTH) {
            CustomToast.INSTANCE.showToast(context, "请输入6-15位验证码");
            return false;
        }
        return true;
    }

    /**
     * 确认密码
     *
     * @param context
     * @param password
     * @param confirmPsd
     */
    public static boolean comfirmPassword(Context context, String password, String confirmPsd) {
        if (!checkPassword(context, password)) {
            return false;
        }
        if (!TextUtils.equals(password, confirmPsd)) {
            CustomToast.INSTANCE.showToast(context, "两次输入密码不一致，请重新输入");
            return false;
        }
        return true;
    }

}
