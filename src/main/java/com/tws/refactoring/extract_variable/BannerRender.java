package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        if (isBrowserOnPlatform(platform, browser)) return "IE on Mac?";
        return "banner";
    }

    private boolean isBrowserOnPlatform(String platform, String browser) {
        if ((platform.toUpperCase().indexOf("MAC") > -1) && (browser.toUpperCase().indexOf("IE") > -1)) {
            return true;
        }
        return false;
    }
}
