import { FunctionComponent, useCallback } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Form } from "react-bootstrap";
import { useNavigate } from "react-router-dom";
import "./ContactDetails.css";

const ContactDetails: FunctionComponent = () => {
  const navigate = useNavigate();

  const onCallHistoryTextClick = useCallback(() => {
    // Please sync "Call History" to the project
  }, []);

  const onTicketDetailsTextClick = useCallback(() => {
    navigate("/ticket");
  }, [navigate]);

  return (
    <div className="contact-details">
      <div className="contact-details-child" />
      <div className="contact-details-item" />
      <div className="contact-details-inner" />
      <img className="rectangle-icon" alt="" src="/rectangle-4175.svg" />
      <img className="ellipse-icon" alt="" src="/ellipse-1@2x.png" />
      <div className="rectangle-div" />
      <div className="call-history" onClick={onCallHistoryTextClick}>
        Call history
      </div>
      <div className="ticket-details" onClick={onTicketDetailsTextClick}>
        Ticket Details
      </div>
      <div className="contact-details-child1" />
      <div className="contact-details-child2" />
      <div className="contact-details-child3" />
      <div className="contact-details-child4" />
      <div className="contact-details-child5" />
      <div className="contact-details-child6" />
      <div className="contact-details-child7" />
      <div className="contact-details-child8" />
      <div className="ai">AI</div>
      <div className="ytsd">5554518ytsd</div>
      <div className="r-25000-">R 25000 - upfront</div>
      <div className="deposit">50% Deposit</div>
      <div className="type-a">Type A</div>
      <div className="account">Account:</div>
      <div className="duration">DUration</div>
      <div className="contract-type">Contract Type</div>
      <div className="line-div" />
      <div className="admin">ADMIN</div>
      <div className="component-1">
        <Form className="wrapper">
          <Form.Control type="text" />
        </Form>
        <div className="login1">LOGOUT</div>
      </div>
      <div className="paymnent-option">Paymnent Option:</div>
      <div className="cost">Cost:</div>
      <div className="package">Package</div>
      <div className="weeks">{`2 weeks `}</div>
      <div className="premium">Premium</div>
      <div className="contract-details">Contract Details</div>
      <img className="contact-details-child9" alt="" src="/ellipse-6@2x.png" />
      <div className="client">CLIENT:</div>
      <div className="john-doe">John Doe</div>
      <div className="ticket">TICKET:</div>
      <div className="a79dfd19">a79dfd19</div>
      <div className="contract-details-page">Contract Details Page</div>
    </div>
  );
};

export default ContactDetails;
