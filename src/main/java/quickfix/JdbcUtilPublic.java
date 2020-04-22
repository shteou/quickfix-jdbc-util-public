package quickfix;

import javax.sql.DataSource;

public class JdbcUtilPublic {
  static DataSource getDataSource(SessionSettings settings, SessionID sessionID) throws ConfigError, FieldConvertError {
    return JdbcUtil.getDataSource(settings, sessionID);
  }
}


