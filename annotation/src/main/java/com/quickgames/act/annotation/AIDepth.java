package com.quickgames.act.annotation;

@AIGenerate(by = AIGenerator.GPT_6, depth = AIDepth.HIGH, reviewed = AIReviewed.VERIFIED)
public enum AIDepth {
    MINIMAL,
    LOW,
    MODERATE,
    HIGH,
    COMPLETE
}
