package dozer.test;

import org.junit.Test;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;

import dozer.test.NestedMessage.Colors;
import dozer.test.NestedMessage.Colors.Color;
import dozer.test.NestedMessage.Inner;
import dozer.test.NestedMessage.Outer;

public class NestedMessagesTest
{
	
	
	@Test
	public void testNestedMessage()
	{
		Mapper mapper = DozerBeanMapperBuilder.create().withMappingBuilders(
				
				new BeanMappingBuilder() {

					@Override
					protected void configure() {
						
						mapping(Inner.class, test.api.v1.Outer.Inner.class);
						mapping(Outer.class, test.api.v1.Outer.class);
						
					}
					
				}
				
		).build();
		
		Outer o = new Outer();
		Inner i = new Inner();
		i.setProp1("1.1");
		o.setProp1(i);
		o.setProp2("1");
		
		mapper.map(o, test.api.v1.Outer.class);
	}
	
	@Test
	public void testFlatMessage()
	{
		Mapper mapper = DozerBeanMapperBuilder.create().withMappingBuilders(
				
				new BeanMappingBuilder() {

					@Override
					protected void configure() {
						
						mapping(Inner.class, test.api.v1.FlatInner.class);
						mapping(Outer.class, test.api.v1.FlatOuter.class);
						
					}
					
				}
				
		).build();
		
		Outer o = new Outer();
		Inner i = new Inner();
		i.setProp1("1.1");
		o.setProp1(i);
		o.setProp2("1");
		
		mapper.map(o, test.api.v1.FlatOuter.class);
		
	}
	
	@Test
	public void testNestedEnum()
	{
		Mapper mapper = DozerBeanMapperBuilder.create().withMappingBuilders(
				
				new BeanMappingBuilder() {

					@Override
					protected void configure() {
						
						mapping(Color.class, test.api.v1.Colors.Color.class);
						mapping(Colors.class, test.api.v1.Colors.class);
						
					}
					
				}
				
		).build();
		
		Colors c = new Colors();
		c.setColor(Color.BLUE);
		
		mapper.map(c, test.api.v1.Colors.class);
		
	}
}
