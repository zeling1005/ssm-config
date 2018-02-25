package xyz.zeling.ssmconfig.modules.welcome;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

import xyz.zeling.ssmconfig.common.BaseSpringWebTest;

public class WelcomeControllerTest extends BaseSpringWebTest {
    @Test
    public void testGetJson() throws Exception {
        this.getMockMvc().perform(post("/welcome/getJson")
                .param("username", "zeling")
                .param("password", "zeling")
            )
            .andExpect(status().isOk())
            .andDo(print());
    }
}
