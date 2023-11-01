
import { useCallback } from "react";
import { useNavigate } from "react-router-dom";
import "./CallHistory.css";

const CallHistory = () => {
  const navigate = useNavigate();

  const onRectangle2Click = useCallback(() => {
    navigate("/ticket");
  }, [navigate]);

  const onContractDetailsTextClick = useCallback(() => {
    navigate("/contact-details");
  }, [navigate]);

  return (
    <div className="call-history1">
      <div className="frame">
        <div className="dashboard1">
          <div className="frame1">
            <div className="frame-child" />
            <img className="frame-item" alt="" src="/ellipse-1@2x.png" />
            <div className="frame-inner" />
            <div className="call-history2">Call history</div>
            <div className="ticket-details1">Ticket Details</div>
            <div className="frame-child1" onClick={onRectangle2Click} />
            <div className="frame-child2" />
            <div className="frame-child3" />
            <div className="frame-child4" />
            <div className="frame-child5" />
            <div className="frame-child6" />
            <div className="frame-child7" />
            <div className="ai1">AI</div>
            <img className="frame-child8" alt="" src="/rectangle-4172.svg" />
            <div className="frame-child9" />
            <div className="frame-child10" />
            <div className="frame-child11" />
            <div className="frame-child12" />
            <div className="frame-child13" />
            <div className="frame-child14" />
            <div className="frame-child15" />
            <div className="home1">
              <div className="home2">Today</div>
              <img className="home-child" alt="" src="/line-1.svg" />
            </div>
            <div className="home3">
              <div className="home2">Yesterday</div>
              <img className="home-child" alt="" src="/line-1.svg" />
            </div>
            <div className="home5">
              <div className="home2">Last week</div>
              <img className="home-child" alt="" src="/line-1.svg" />
            </div>
            <div className="last-month">Last month</div>
            <div className="months-ago">6 months ago</div>
            <div className="frame-child16" />
            <div className="admin">ADMIN</div>
            <div className="component-11">
              <div className="component-1-item" />
              <div className="login2">LOGOUT</div>
            </div>
            <div className="div">05:05</div>
            <div className="received">Received</div>
            <div className="received1">Received</div>
            <div className="received2">Received</div>
            <div className="received3">Received</div>
            <div className="canceled">Canceled</div>
            <div className="canceled1">Canceled</div>
            <div className="canceled2">Canceled</div>
            <div className="div1">10:43</div>
            <div className="div2">00:05</div>
            <div className="div3">03:25</div>
            <div className="div4">00:10</div>
            <div className="div5">06:15</div>
            <div className="div6">00:30</div>
            <div className="john-doe1">John Doe</div>
            <div className="dan-smin">Dan Smin</div>
            <div className="max-dune">Max Dune</div>
            <div className="tony-leo">Tony Leo</div>
            <div className="chris-trint">Chris Trint</div>
            <div className="alan-walker">Alan Walker</div>
            <div className="james-bond">James Bond</div>
            <img
              className="icon-tick-square-1"
              alt=""
              src="/-icon--tick-square--1@2x.png"
            />
            <img
              className="icon-cancel-1"
              alt=""
              src="/-icon--cancel--1@2x.png"
            />
            <img
              className="icon-call-received-1"
              alt=""
              src="/-icon--call-received--1@2x.png"
            />
            <img
              className="icon-call-received-4"
              alt=""
              src="/-icon--call-received--1@2x.png"
            />
            <img
              className="icon-call-received-3"
              alt=""
              src="/-icon--call-received--1@2x.png"
            />
            <img
              className="icon-call-received-2"
              alt=""
              src="/-icon--call-received--1@2x.png"
            />
            <img
              className="icon-call-remove-1"
              alt=""
              src="/-icon--call-remove--1@2x.png"
            />
            <img
              className="icon-call-remove-2"
              alt=""
              src="/-icon--call-remove--1@2x.png"
            />
            <img
              className="icon-call-remove-3"
              alt=""
              src="/-icon--call-remove--1@2x.png"
            />
            <div className="frame-child17" />
            <div className="call-history-page">Call History Page</div>
          </div>
          <div className="frame2">
            <div className="frame-child18" />
            <div className="frame-child19" />
          </div>
        </div>
        <div className="frame3">
          <div
            className="contract-details1"
            onClick={onContractDetailsTextClick}
          >
            Contract Details
          </div>
        </div>
      </div>
      <div className="frame4">
        <div className="frame5">
          <div className="call-status">Call Status:</div>
        </div>
        <div className="frame6">
          <div className="call-status">Request Placed:</div>
        </div>
        <div className="frame7">
          <div className="call-status">Duration:</div>
        </div>
        <div className="frame8">
          <div className="call-status">Client:</div>
        </div>
      </div>
    </div>
  );
};

export default CallHistory;
