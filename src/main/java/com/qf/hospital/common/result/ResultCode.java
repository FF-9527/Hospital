package com.qf.hospital.common.result;

/**
 * @program: Hospital
 * @author: FF
 * @date: 2019-12-10 22:16
 */
public enum ResultCode {
    OK(200), ERROR(400), NOTFOUND(404);
    private int val;
    private ResultCode(int v) {
        val = v;
    }
    public int getVal() {
        return val;
    }
}
