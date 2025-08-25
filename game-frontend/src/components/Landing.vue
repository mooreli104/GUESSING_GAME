<script setup>
    import { ref } from 'vue'
    console.log(crypto.randomUUID())


    var username = ref('')
    async function send_username(username){
        const response = await fetch("http://localhost:8080/game-backend", {
            method: "POST",
            body: JSON.stringify({ username: { username } }),
            
});
    }

</script>

<template>

    <p>Enter a username</p>
    <input type="text" @click = send_username(username) >{{ username }}</input>
    <button type="submit">Submit</button>

</template>

<style></style>