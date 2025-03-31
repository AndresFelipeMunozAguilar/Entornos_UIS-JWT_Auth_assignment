import * as React from 'react'
import WelcomeContent from './WelcomeContent'
import AuthContent from './AuthContent'
import LoginForm from './LoginForm'
import { request, setAuthToken, resetAuthToken } from '../axios_helper'
import Buttons from './Buttons'

window.onload = function () {
  resetAuthToken()
}

export default class AppContent extends React.Component {

  constructor(props) {

    super(props)

    this.state = {
      componentToShow: "welcome"
    }
  }

  login = () => {
    this.setState({ componentToShow: "login" });
  }

  logout = () => {
    this.setState({ componentToShow: "welcome" });
  }

  onLogin = (event, username, password) => {
    event.preventDefault();

    request(
      "POST",
      "/login",
      { login: username, password: password }
    ).then(
      (response) => {
        this.setState({ componentToShow: "messages" })
        setAuthToken(response.data.token)
      }
    ).catch(
      (error) => {
        this.setState({ componentToShow: "welcome" })
      }
    )

  }

  onRegister = (event, firstName, lastName, username, password) => {
    event.preventDefault();

    request(
      "POST",
      "/register",
      {
        firstName: firstName,
        lastName: lastName,
        login: username,
        password: password
      }
    ).then(
      (response) => {
        this.setState({ componentToShow: "messages" })
        setAuthToken(response.data.token)
      }
    ).catch(
      (error) => {
        this.setState({ componentToShow: "welcome" })
      }
    )

  }


  render() {
    return (
      <div>

        <Buttons login={this.login} logout={this.logout} />

        {this.state.componentToShow === "welcome" && <WelcomeContent />}
        {this.state.componentToShow === "messages" && <AuthContent />}
        {this.state.componentToShow === "login" && <LoginForm onLogin={this.onLogin} onRegister={this.onRegister} />}

      </div>
    );
  }
}
