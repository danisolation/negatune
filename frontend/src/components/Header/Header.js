import React from "react";
import { Link } from "react-router-dom";
import classNames from "classnames/bind";
import styles from "./Header.module.scss";
import images from "../../assets/images/images";

const cx = classNames.bind(styles);

const Header = () => (
  <header className={cx("header")}>
    <div className={cx("container")}>
      <nav className={cx("navbar")}>
        <a className={cx("brand")} href="/">
          <img className={cx("img")} src={images.logo} />
        </a>
        <Link to="/">Home</Link>
        <Link to="/login">Login</Link>
        <Link to="/register">Register</Link>
      </nav>
    </div>
  </header>
);

export default Header;
