import { useCallback } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Form } from "react-bootstrap";
import { useNavigate } from "react-router-dom";
import "./ContactDetails.css";

const ContactDetails = () => {
  const navigate = useNavigate();

  const onCallHistoryTextClick = useCallback(() => {
    navigate("/call-history");
  }, [navigate]);

  const onTicketDetailsTextClick = useCallback(() => {
    navigate("/ticket");
  }, [navigate]);

  return (
    <div className="contact-details">
      <div className="contact-details-child" />
      <div className="contact-details-item" />
      <div className="contact-details-inner" />
      <img
        className="contact-details-child1"
        alt=""
        src="/rectangle-4172.svg"
      />
      <img className="contact-details-child2" alt="" src="/ellipse-1@2x.png" />
      <div className="contact-details-child3" />
      <div className="call-history6" onClick={onCallHistoryTextClick}>
        Call history
      </div>
      <div className="ticket-details5" onClick={onTicketDetailsTextClick}>
        Ticket Details
      </div>
      <div className="contact-details-child4" />
      <div className="contact-details-child5" />
      <div className="contact-details-child6" />
      <div className="contact-details-child7" />
      <div className="contact-details-child8" />
      <div className="contact-details-child9" />
      <div className="contact-details-child10" />
      <div className="contact-details-child11" />
      <div className="ai5">AI</div>
      <div className="ytsd">5554518ytsd</div>
      <div className="r-25000-2">R 25000 - upfront</div>
      <div className="deposit">50% Deposit</div>
      <div className="type-a">Type A</div>
      <div className="account">Account:</div>
      <div className="duration3">DUration</div>
      <div className="contract-type">Contract Type</div>
      <div className="contact-details-child12" />
      <div className="admin1">ADMIN</div>
      <div className="component-15">
        <Form className="wrapper">
          <Form.Control type="text" />
        </Form>
        <div className="login6">LOGOUT</div>
      </div>
      <div className="paymnent-option">Paymnent Option:</div>
      <div className="cost2">Cost:</div>
      <div className="package2">Package</div>
      <div className="weeks">{`2 weeks `}</div>
      <div className="premium">Premium</div>
      <div className="contract-details5">Contract Details</div>
      <img className="contact-details-child13" alt="" src="/ellipse-6@2x.png" />
      <div className="client3">CLIENT:</div>
      <div className="john-doe5">John Doe</div>
      <div className="ticket2">TICKET:</div>
      <div className="a79dfd192">a79dfd19</div>
      <div className="contract-details-page">Contract Details Page</div>
    </div>
  );
};

export default ContactDetails;
