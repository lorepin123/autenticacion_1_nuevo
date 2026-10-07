document.getElementById("loginForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const usuario = document.getElementById("usuario").value;
    const password = document.getElementById("password").value;

    const response = await fetch("/auth/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ usuario, password })
    });

    const data = await response.text();

    if (response.ok) {
        localStorage.setItem("token", data);
        window.location.href = "/home.html";
    } else {
        document.getElementById("mensaje").innerText = data;
    }
});
