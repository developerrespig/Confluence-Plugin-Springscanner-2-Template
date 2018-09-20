package ut.de.gypser.martin.confluence.plugins.templates;

import org.junit.Test;
import de.gypser.martin.confluence.plugins.templates.api.MyPluginComponent;
import de.gypser.martin.confluence.plugins.templates.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}