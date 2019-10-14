package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_render_banner() {
        BannerRender banner = new BannerRender();

        String platform = "MAC";
        String browser = "IE";

        String result = banner.renderBanner(platform, browser);

        assertEquals("IE on Mac?", result);
    }
}