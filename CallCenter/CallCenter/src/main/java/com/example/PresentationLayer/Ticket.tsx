import { useCallback } from "react";
import { useNavigate } from "react-router-dom";
import "./Ticket.css";

const Ticket = () => {
  const navigate = useNavigate();

  const onCallHistoryTextClick = useCallback(() => {
    navigate("/call-history");
  }, [navigate]);

  const onContractDetailsTextClick = useCallback(() => {
    navigate("/contact-details");
  }, [navigate]);

  return (
    <div className="ticket3">
      <div className="dashboard5">
        <div className="dashboard-child64" />
        <div className="dashboard-child65" />
        <div className="dashboard-child66" />
        <div className="dashboard-child67" />
        <img className="dashboard-child68" alt="" src="/ellipse-1@2x.png" />
        <div className="dashboard-child69" />
        <div className="call-history8" onClick={onCallHistoryTextClick}>
          Call history
        </div>
        <div className="ticket-details6">Ticket Details</div>
        <div className="dashboard-child70" />
        <div className="dashboard-child71" />
        <div className="dashboard-child72" />
        <div className="dashboard-child73" />
        <div className="dashboard-child74" />
        <div className="dashboard-child75" />
        <div className="dashboard-child76" />
        <div className="ai8">AI</div>
        <img className="dashboard-child77" alt="" src="/rectangle-4172.svg" />
        <div className="eg6016584712123542191236938">
          EG6016584712123542191236938
        </div>
        <div className="price-center-new">
          6614 Price Center, New Ligiafort, AR 02259-0368
        </div>
        <div className="sam4">SAM</div>
        <div className="a79dfd193">a79dfd19</div>
        <div className="account1">Account:</div>
        <div className="ticket-status">Ticket Status:</div>
        <div className="current-ticket">Current Ticket:</div>
        <div className="dashboard-child78" />
        <div className="admin2">ADMIN</div>
        <div className="component-18">
          <div className="component-1-child4" />
          <div className="login9">LOGOUT</div>
        </div>
        <div className="technician2">Technician:</div>
        <div className="address">Address:</div>
        <div className="contact-name">Contact (Name):</div>
        <div className="in-progress">IN PROGRESS</div>
        <div className="div13">015 462 5978</div>
        <div className="clients">Clients</div>
        <div className="contract-details6" onClick={onContractDetailsTextClick}>
          Contract Details
        </div>
      </div>
      <div className="john-doe6">John Doe</div>
      <div className="peter-parker">Peter Parker</div>
      <div className="bruce-wayne">Bruce Wayne</div>
      <div className="barry-allen">Barry Allen</div>
      <div className="ticket-details-page">Ticket Details Page</div>
    </div>
  );
};

export default Ticket;

