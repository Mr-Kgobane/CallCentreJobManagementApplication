import { FunctionComponent } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button } from "react-bootstrap";
import "./LoginAccount.css";

const LoginAccount: FunctionComponent = () => {
  return (
    <div className="login-account">
      <div className="login-account-child" />
      <div className="ai">AI</div>
      <div className="login-account-item" />
      <div className="login1">LOGIN</div>
      <div className="login-account-inner" />
      <div className="username">Username</div>
      <div className="password">Password</div>
      <img className="rectangle-icon" alt="" src="/rectangle-4151.svg" />
      <div className="forgot-usernamepassword">forgot username/password</div>
      <Button className="component-1" variant="outline-primary">
        LOGIN
      </Button>
    </div>
  );
};

export default LoginAccount;
