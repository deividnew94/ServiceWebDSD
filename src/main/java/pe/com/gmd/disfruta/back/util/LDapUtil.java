package pe.com.gmd.disfruta.back.util;

//import java.util.List;

//import javax.naming.NamingException;
//import javax.naming.directory.Attributes;

//import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
//import org.springframework.ldap.core.NameClassPairCallbackHandler;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.Filter;

import pe.com.gmd.disfruta.back.model.Empresa;
//import pe.com.gmd.disfruta.back.model.Usuario;

public class LDapUtil {
	
	LdapContextSource contextSource;
	LdapTemplate ldapTemplate;

	public LDapUtil(Empresa empresa) throws Exception{
		contextSource = new LdapContextSource();
		contextSource.setUrl(empresa.getLdap().getUrlLdap());
		contextSource.setBase(empresa.getLdap().getBaseLdap());
		contextSource.setUserDn(empresa.getLdap().getUserLdap());
		contextSource.setPassword(empresa.getLdap().getPassLdap());
			
		
		/*contextSource = new LdapContextSource();
		contextSource.setUrl("ldap://gmd.com.pe:3268");
		contextSource.setUrl("ldap://gym.com.pe:3268");
		contextSource.setBase("DC=GMD,DC=COM,DC=PE");
		contextSource.setBase("DC=GYM,DC=COM,DC=PE");
		contextSource.setUserDn("rhuamani@gmd.com.pe");
		contextSource.setUserDn("disfruta.beneficiosg@gym.com.pe");
		contextSource.setPassword("pilarcita2010");
		contextSource.setPassword("Noviembre2016");*/
		
		contextSource.afterPropertiesSet();
	
		ldapTemplate = new LdapTemplate(contextSource);		
		ldapTemplate.afterPropertiesSet();
	}
	
	public boolean loginUsuario(String usuario, String contrasena) throws Exception{
		Filter filter = new EqualsFilter("sAMAccountName", usuario);

		boolean authed = ldapTemplate.authenticate("",filter.encode(), contrasena);

		// Display the results.
		System.out.println("Authenticated: " + authed);
		return authed;
	}
	
	public void obtenerUsuario(String usuario){
		/*String filter = "uid=rhuamani";
		NameClassPairCallbackHandler mapper;
		List lUser = ldapTemplate.search("ou=users", "(uid=rhuamani)",
         new AttributesMapper() {
            public Object mapFromAttributes(Attributes attrs)
               throws NamingException {
               return attrs.get("cn").get();
            }
         });*/
	}
	
	
}
