package com.vitaxa.steamkit.util;

import com.vitaxa.steamkit.TestBase;
import org.junit.Assert;
import org.junit.Test;
import uk.co.thomasc.steamkit.util.WebHelpers;

public class WebHelpersTest extends TestBase {

    @Test
    public void urlEncode() {
        String result = WebHelpers.urlEncode("encrypt THIS sTrInG1234 \10 \11 \12");
        Assert.assertEquals("encrypt+THIS+sTrInG1234+%08+%09+%0A", result);
    }
}
