import * as React from 'react'

export default function Header(props) {
    return (
        <header>
            <img src={props.logoSrc} alt="logo" height="500px" widht="500px" />
            <h1>{props.pageTitle}</h1>
        </header>
    )
}

