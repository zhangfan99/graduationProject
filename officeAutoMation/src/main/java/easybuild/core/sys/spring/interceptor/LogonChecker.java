package easybuild.core.sys.spring.interceptor;

public interface LogonChecker {

    /**
     * 是否需要登录
     *
     * @return
     */
    public boolean requireLogon();

    /**
     * 是否已登录
     *
     * @return
     */
    public boolean isLogon();
}