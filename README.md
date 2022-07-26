# distributed-tracing-sender

This repository contains the source code for `sender` service.

# Commands

- Build Jar

    ``` shell
    # Clean up
    ./gradlew clean

    # Build
    ./gradlew build
    ```

- Build container image

    ``` shell
    # List podman machine
    podman machine list

    # Build container image
    podman build -t docker.io/yogiman/distributed-tracing-sender  . 

    podman image push docker.io/yogiman/distributed-tracing-sender
    ```


- Run cotainer

    ``` shell
    # start containers
    podman container run \
    --publish 8080:8080 \
    --rm \
    docker.io/yogiman/distributed-tracing-sender

    # list containers
    podman container list
    ```

- Deploy service

    ``` shell
    kubectl delete -f ./k8s/service.yaml

    kubectl apply -f ./k8s/service.yaml
    ```

- Debug

    ``` shell
    kubectl run \
    -it \
    --rm=true \
    --restart=Never \
    --image=ubuntu \
    bash
    ```
