package com.quickgames.act.annotation;

@AIGenerate(by = {AIGenerator.GEMINI_3_6_FLASH, AIGenerator.GPT_6}, depth = AIDepth.MODERATE, reviewed = AIReviewed.VERIFIED)
public enum AIGenerator {

    // Google
    GEMINI(Model.GEMINI, Vendor.GOOGLE),
    GEMINI_FLASH_LITE(Model.GEMINI, Suffix.FLASH_LITE, Vendor.GOOGLE),
    GEMINI_FLASH(Model.GEMINI, Suffix.FLASH, Vendor.GOOGLE),
    GEMINI_PRO(Model.GEMINI, Suffix.PRO, Vendor.GOOGLE),
    GEMINI_3_5_FLASH_LITE(Model.GEMINI, "3.5", Suffix.FLASH_LITE, Vendor.GOOGLE),
    GEMINI_3_6_FLASH(Model.GEMINI, "3.6", Suffix.FLASH, Vendor.GOOGLE),
    GEMINI_3_1_PRO(Model.GEMINI, "3.1", Suffix.PRO, Vendor.GOOGLE),

    // Open AI
    GPT(Model.GPT, Vendor.OPEN_AI),
    GPT_6(Model.GPT, "6", Vendor.OPEN_AI),

    // Anthropic
    CLAUDE(Model.CLAUDE, Vendor.ANTHROPIC),

    // Meta
    LLAMA(Model.LLAMA, Vendor.META),

    // DeepSeek
    DEEPSEEK(Model.DEEPSEEK, Vendor.DEEPSEEK),

    // Mistral AI
    MISTRAL(Model.MISTRAL, Vendor.MISTRAL_AI),

    // xAI
    GROK(Model.GROK, Vendor.XAI),

    // Alibaba
    QWEN(Model.QWEN, Vendor.ALIBABA),

    // Microsoft
    PHI(Model.PHI, Vendor.MICROSOFT),

    // Cohere
    COMMAND(Model.COMMAND, Vendor.COHERE),

    // Amazon
    NOVA(Model.NOVA, Vendor.AMAZON),

    // AI21 Labs
    JAMBA(Model.JAMBA, Vendor.AI21_LABS),

    // Zhipu AI
    GLM(Model.GLM, Vendor.ZHIPU),

    // Moonshot AI
    KIMI(Model.KIMI, Vendor.MOONSHOT),

    // MiniMax
    MINIMAX(Model.MINIMAX, Vendor.MINIMAX),

    // Baidu
    ERNIE(Model.ERNIE, Vendor.BAIDU),

    // Tencent
    HUNYUAN(Model.HUNYUAN, Vendor.TENCENT),

    // ByteDance
    SEED(Model.SEED, Vendor.BYTEDANCE),

    // IBM
    GRANITE(Model.GRANITE, Vendor.IBM),

    // Allen Institute for AI
    OLMO(Model.OLMO, Vendor.ALLEN_INSTITUTE),

    // Technology Innovation Institute
    FALCON(Model.FALCON, Vendor.TII),

    // Perplexity
    SONAR(Model.SONAR, Vendor.PERPLEXITY),

    // Other / Unknown
    OTHER(Model.OTHER, Vendor.UNKNOWN);

    private final Model model;
    private final String version;
    private final Suffix suffix;
    private final Vendor vendor;

    AIGenerator(Model model, Vendor vendor) {
        this(model, "", null, vendor);
    }

    AIGenerator(Model model, String version, Vendor vendor) {
        this(model, version, null, vendor);
    }

    AIGenerator(Model model, Suffix suffix, Vendor vendor) {
        this(model, "", suffix, vendor);
    }

    AIGenerator(Model model, String version, Suffix suffix, Vendor vendor) {
        this.model = model;
        this.version = version;
        this.suffix = suffix;
        this.vendor = vendor;
    }

    public Model getModel() {
        return model;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public String getVersion() {
        return version;
    }

    public Suffix getSuffix() {
        return suffix;
    }

    @Override
    public String toString() {
        String result = model.toString();
        if (!version.isEmpty())
            result += "-" + version;
        if (suffix != null)
            result += "-" + suffix;
        return result;
    }

    public enum Model {
        GEMINI,
        GPT,
        CLAUDE,
        LLAMA,
        DEEPSEEK,
        MISTRAL,
        GROK,
        QWEN,
        PHI,
        COMMAND,
        NOVA,
        JAMBA,
        GLM,
        KIMI,
        MINIMAX,
        ERNIE,
        HUNYUAN,
        SEED,
        GRANITE,
        OLMO,
        FALCON,
        SONAR,
        OTHER
    }

    public enum Vendor {
        GOOGLE,
        OPEN_AI,
        ANTHROPIC,
        META,
        DEEPSEEK,
        MISTRAL_AI,
        XAI,
        ALIBABA,
        MICROSOFT,
        COHERE,
        AMAZON,
        AI21_LABS,
        ZHIPU,
        MOONSHOT,
        MINIMAX,
        BAIDU,
        TENCENT,
        BYTEDANCE,
        IBM,
        ALLEN_INSTITUTE,
        TII,
        PERPLEXITY,
        UNKNOWN
    }


    public enum Suffix {

        FLASH_LITE("Flash-Lite"),
        FLASH("Flash"),
        PRO("Pro");

        private final String suffix;

        Suffix(String suffix) {
            this.suffix = suffix;
        }

        @Override
        public String toString() {
            return suffix;
        }

    }

}
