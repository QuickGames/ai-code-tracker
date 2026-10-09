package com.quickgames.act.annotation;

@AIGenerate(by = AIGenerator.GPT_6, depth = AIDepth.HIGH, reviewed = AIReviewed.VERIFIED)
public enum AIReviewed {
    UNKNOWN,
    UNREVIEWED,
    SUPERFICIAL,
    REVIEWED,
    TESTED,
    VERIFIED
}
