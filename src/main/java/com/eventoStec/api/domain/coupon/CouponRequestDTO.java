package com.eventoStec.api.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
