import { FunctionComponent, useCallback } from "react";
import "./Ticket.css";

const Ticket: FunctionComponent = () => {
  const onCallHistoryTextClick = useCallback(() => {
    // Please sync "Call History" to the project
  }, []);

  const onContractDetailsTextClick = useCallback(() => {
    // Please sync "Contact details" to the project
  }, []);

  return (
    <div className="ticket">
      <div className="dashboard">
        <div className="dashboard-child" />
        <div className="dashboard-item" />
        <div className="dashboard-inner" />
        <div className="rectangle-div" />
        <img className="ellipse-icon" alt="" src="/ellipse-1@2x.png" />
        <div className="dashboard-child1" />
        <div className="call-history" onClick={onCallHistoryTextClick}>
          Call history
        </div>
        <div className="ticket-details">Ticket Details</div>
        <div className="dashboard-child2" />
        <div className="dashboard-child3" />
        <div className="dashboard-child4" />
        <div className="dashboard-child5" />
        <div className="dashboard-child6" />
        <div className="dashboard-child7" />
        <div className="dashboard-child8" />
        <div className="ai">AI</div>
        <img className="rectangle-icon" alt="" src="/rectangle-4172.svg" />
        <div className="eg6016584712123542191236938">
          EG6016584712123542191236938
        </div>
        <div className="price-center-new">
          6614 Price Center, New Ligiafort, AR 02259-0368
        </div>
        <div className="sam">SAM</div>
        <div className="a79dfd19">a79dfd19</div>
        <div className="account">Account:</div>
        <div className="ticket-status">Ticket Status:</div>
        <div className="current-ticket">Current Ticket:</div>
        <div className="line-div" />
        <div className="admin">ADMIN</div>
        <div className="component-1">
          <div className="component-1-child" />
          <div className="login1">LOGOUT</div>
        </div>
        <div className="technician">Technician:</div>
        <div className="address">Address:</div>
        <div className="contact-name">Contact (Name):</div>
        <div className="in-progress">IN PROGRESS</div>
        <div className="div">015 462 5978</div>
        <div className="clients">Clients</div>
        <div className="contract-details" onClick={onContractDetailsTextClick}>
          Contract Details
        </div>
      </div>
      <div className="john-doe">John Doe</div>
      <div className="peter-parker">Peter Parker</div>
      <div className="bruce-wayne">Bruce Wayne</div>
      <div className="barry-allen">Barry Allen</div>
      <div className="ticket-details-page">Ticket Details Page</div>
    </div>
  );
};

export default Ticket;
