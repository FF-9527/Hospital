package com.qf.hospital.sms.service;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.dto.PhoneCodeDto;

public interface SmsService {

    R sendSmsCode(String phone);
    R checkSmsCode(PhoneCodeDto codeDto);
}
