/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/")
public class Filtre implements Filter{

    @Override
    public void doFilter(ServletRequest servReq, ServletResponse servResp, FilterChain filtre) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servReq;
        ((HttpServletResponse) servResp).addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST");
        ((HttpServletResponse) servResp).addHeader("Access-Control-Allow-Origin", "*");
       
        HttpServletResponse resp = (HttpServletResponse) servResp;


        if(req.getMethod().equals("OPTIONS")){
            resp.setStatus(HttpServletResponse.SC_ACCEPTED);
            return;
        }

        filtre.doFilter(servReq, servResp);
    }

}